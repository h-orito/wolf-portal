$(function() {
	const contextPath = $('#context-path').text();

	$('body').on('click', '[data-village]', function() {
		$('[data-village-no-form]').trigger('submit');
	});
	
	$('[data-village-no-form]').on('submit', function(){
		const countryId = $(this).data('village-no-form');
		const villageNo = $(this).closest('form').find('[name=villageNo]').val();
		return gotoVillage(countryId, villageNo);
	});
	
	function gotoVillage(countryId, villageNo) {
		if (!$.isNumeric(villageNo)) {
			return false;
		}
		location.href = contextPath + 'stats/country/' + countryId + '/village-no/' + villageNo;
		return false;
	}
	
	$('body').on('click', '[data-user]', function() {
		$('[data-user-id-form]').trigger('submit');
	});
	
	$('[data-user-id-form]').on('submit', function(){
		const countryId = $(this).data('user-id-form');
		const userId = $(this).closest('form').find('[name=userId]').val();
		return gotoPlayer(countryId, userId);
	});
	
	function gotoPlayer(countryId, userId) {
		const query = {
				userId: userId
		}
		location.href = contextPath + 'stats/country/' + countryId + '/player-list?' + $.param(query);
		return false;
	}
});