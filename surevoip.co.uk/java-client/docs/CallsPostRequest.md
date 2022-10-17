

# CallsPostRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**announcementAt** | **String** | is in seconds. Just take 120 secs away from the hangup_at time for a announcement to be played 2 mins before the end of the call. If provided announcement_id is required  |  [optional] |
|**announcementId** | **String** | is the announcement id (from https://api.surevoip.co.uk/customers/{customer}/announcements/{announcement_id}) to play for example “your call is about to end in 2 mins”. We only allow a wav file, but we may allow \&quot;words\&quot;, which will use SureVoIP provided text to speech. If provided announcement_at is required  |  [optional] |
|**callerId** | **String** | The caller ID to show the b leg (to). |  |
|**from** | **String** | The person making the call, i.e the a leg. This person must answer in order for the b leg to be rung |  |
|**hangupAnnouncementId** | **String** | the id of a thank you announcement or similar. You can manage these as you would with any RESTful resource at https://api.surevoip.co.uk/announcements and https://api.surevoip.co.uk/customers/{customer}/announcements/{announcement_id}. It will be played at the end of the call at hangup. If provided hangup_at is required.  |  [optional] |
|**hangupAt** | **String** | length in seconds from when the call is *answered* to when the system hangs up. If \&quot;hangup_announcement_id\&quot; is present, this will be played at hangup  |  [optional] |
|**options** | [**CallsPostRequestOptions**](CallsPostRequestOptions.md) |  |  [optional] |
|**to** | **String** | The b leg of the call, i.e. the person you are calling |  |



