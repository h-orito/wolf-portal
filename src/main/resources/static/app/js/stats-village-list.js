$(function() {
	const contextPath = $('#context-path').text();
	const defaultVillageName = $('#villageName').val(); // 画面表示時の検索条件

	$('body').on('click', '[data-prev-page]', function() {
		const currentPage = parseInt($(this).data('prev-page'));
		search(currentPage - 1, defaultVillageName);
	});
	$('body').on('click', '[data-next-page]', function() {
		const currentPage = parseInt($(this).data('next-page'));
		search(currentPage + 1, defaultVillageName);
	});
	$('body').on('click', '[data-pagenum]', function() {
		search(parseInt($(this).data('pagenum')), defaultVillageName);
	});
	
	$('#search-form').on('submit', function(){
		search(null, $('#villageName').val());
		return false;
	});

	function search(pageNum, villageName) {
		const query = {
			page : pageNum,
			villageName: villageName
		}
		window.location.href = location.pathname + '?' + $.param(query);
	}

	$('body').on('click', '[data-village]', function() {
		gotoVillage();
	});
	$('#village-no-form').submit(function(){
		gotoVillage();
		return false;
	});
	
	function gotoVillage() {
		const villageNo = $('#village-no').val();
		if (!$.isNumeric(villageNo)) {
			return;
		}
		window.location.href = location.pathname.replace(/village-list.*/g, 'village-no/') + villageNo;
	}
});