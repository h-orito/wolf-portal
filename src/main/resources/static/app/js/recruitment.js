$(function() {
	const contextPath = $('#context-path').text();
	const ctx = document.getElementById('canvas').getContext('2d');
	ctx.canvas.height = 300;

	$('[data-hide-no-recruit]').on('click', function() {
		$('[data-hide-no-recruit]').addClass('hidden');
		$('[data-no-disp]').each(function() {
			if ($(this).data('no-disp')) {
				$(this).addClass('hidden');
			}
		});
		$('[data-disp-no-recruit]').removeClass('hidden');
	});
	$('[data-disp-no-recruit]').on('click', function() {
		$('[data-disp-no-recruit]').addClass('hidden');
		$('[data-no-disp]').each(function() {
			$(this).removeClass('hidden');
		});
		$('[data-hide-no-recruit]').removeClass('hidden');
	});
	// 初期表示時は開催中の国のみにする
	$('[data-hide-no-recruit]').trigger('click');

	$.ajax(contextPath + 'recruitment-graph/').then(function(response) {
		const lineChartData = {
			labels : response.datetimeList,
			datasets : [ {
				label : '村数',
				borderColor : '#ff0000',
				backgroundColor : '#ff0000',
				fill : false,
				data : response.villageNumList,
				yAxisID : 'y-axis-1',
			}, {
				label : '参加者数',
				borderColor : '#0000ff',
				backgroundColor : '#0000ff',
				fill : false,
				data : response.participateNumList,
				yAxisID : 'y-axis-2'
			} ]
		};

		window.myLine = Chart.Line(ctx, {
			data : lineChartData,
			options : {
				responsive : true,
				hoverMode : 'index',
				stacked : false,
				title : {
					display : true,
					text : '開催中の村数、参加者数の履歴'
				},
				scales : {
					yAxes : [ {
						type : 'linear',
						display : true,
						position : 'left',
						id : 'y-axis-1',
						ticks : {
							beginAtZero : true
						}
					}, {
						type : 'linear',
						display : true,
						position : 'right',
						id : 'y-axis-2',
						gridLines : {
							drawOnChartArea : false
						},
						ticks : {
							beginAtZero : true
						}
					} ]
				},
				responsive : true,
				maintainAspectRatio : false
			}
		});
	});
	
	$('[data-show-description]').on('click', function(){
		const $descspan = $(this).closest('span').find('span');
		$descspan.text($descspan.attr('title'));
		$(this).addClass('hidden');
	});
});