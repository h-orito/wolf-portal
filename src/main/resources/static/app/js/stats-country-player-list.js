$(function() {
	const contextPath = $('#context-path').text();
	const defaultUserId = $('#userId').val(); // 画面表示時のuserId
	

	$('body').on('click', '[data-prev-page]', function() {
		const currentPage = parseInt($(this).data('prev-page'));
		search(currentPage - 1, defaultUserId);
	});
	$('body').on('click', '[data-next-page]', function() {
		const currentPage = parseInt($(this).data('next-page'));
		search(currentPage + 1, defaultUserId);
	});
	$('body').on('click', '[data-pagenum]', function() {
		search(parseInt($(this).data('pagenum')), defaultUserId);
	});
	
	$('#search-form').on('submit', function(){
		search(null, $('#userId').val());
		return false;
	});

	function search(pageNum, userId) {
		const query = {
			page : pageNum,
			userId: userId
		}
		window.location.href = location.pathname + '?' + $.param(query);
	}
});