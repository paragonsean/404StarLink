

# Query

The query definition used for search and export.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountInfo** | [**AccountInfo**](AccountInfo.md) |  |  [optional] |
|**corpus** | [**CorpusEnum**](#CorpusEnum) | The Google Workspace service to search. |  [optional] |
|**dataScope** | [**DataScopeEnum**](#DataScopeEnum) | The data source to search. |  [optional] |
|**driveOptions** | [**DriveOptions**](DriveOptions.md) |  |  [optional] |
|**endTime** | **String** | The end time for the search query. Specify in GMT. The value is rounded to 12 AM on the specified date. |  [optional] |
|**hangoutsChatInfo** | [**HangoutsChatInfo**](HangoutsChatInfo.md) |  |  [optional] |
|**hangoutsChatOptions** | [**HangoutsChatOptions**](HangoutsChatOptions.md) |  |  [optional] |
|**mailOptions** | [**MailOptions**](MailOptions.md) |  |  [optional] |
|**method** | [**MethodEnum**](#MethodEnum) | The entity to search. This field replaces **searchMethod** to support shared drives. When **searchMethod** is **TEAM_DRIVE**, the response of this field is **SHARED_DRIVE**. |  [optional] |
|**orgUnitInfo** | [**OrgUnitInfo**](OrgUnitInfo.md) |  |  [optional] |
|**searchMethod** | [**SearchMethodEnum**](#SearchMethodEnum) | The search method to use. |  [optional] |
|**sharedDriveInfo** | [**SharedDriveInfo**](SharedDriveInfo.md) |  |  [optional] |
|**sitesUrlInfo** | [**SitesUrlInfo**](SitesUrlInfo.md) |  |  [optional] |
|**startTime** | **String** | The start time for the search query. Specify in GMT. The value is rounded to 12 AM on the specified date. |  [optional] |
|**teamDriveInfo** | [**TeamDriveInfo**](TeamDriveInfo.md) |  |  [optional] |
|**terms** | **String** | Service-specific [search operators](https://support.google.com/vault/answer/2474474) to filter search results. |  [optional] |
|**timeZone** | **String** | The time zone name. It should be an IANA TZ name, such as \&quot;America/Los_Angeles\&quot;. For a list of time zone names, see [Time Zone](https://en.wikipedia.org/wiki/List_of_tz_database_time_zones). For more information about how Vault uses time zones, see [the Vault help center](https://support.google.com/vault/answer/6092995#time). |  [optional] |
|**voiceOptions** | [**VoiceOptions**](VoiceOptions.md) |  |  [optional] |



## Enum: CorpusEnum

| Name | Value |
|---- | -----|
| CORPUS_TYPE_UNSPECIFIED | &quot;CORPUS_TYPE_UNSPECIFIED&quot; |
| DRIVE | &quot;DRIVE&quot; |
| MAIL | &quot;MAIL&quot; |
| GROUPS | &quot;GROUPS&quot; |
| HANGOUTS_CHAT | &quot;HANGOUTS_CHAT&quot; |
| VOICE | &quot;VOICE&quot; |



## Enum: DataScopeEnum

| Name | Value |
|---- | -----|
| DATA_SCOPE_UNSPECIFIED | &quot;DATA_SCOPE_UNSPECIFIED&quot; |
| ALL_DATA | &quot;ALL_DATA&quot; |
| HELD_DATA | &quot;HELD_DATA&quot; |
| UNPROCESSED_DATA | &quot;UNPROCESSED_DATA&quot; |



## Enum: MethodEnum

| Name | Value |
|---- | -----|
| SEARCH_METHOD_UNSPECIFIED | &quot;SEARCH_METHOD_UNSPECIFIED&quot; |
| ACCOUNT | &quot;ACCOUNT&quot; |
| ORG_UNIT | &quot;ORG_UNIT&quot; |
| TEAM_DRIVE | &quot;TEAM_DRIVE&quot; |
| ENTIRE_ORG | &quot;ENTIRE_ORG&quot; |
| ROOM | &quot;ROOM&quot; |
| SITES_URL | &quot;SITES_URL&quot; |
| SHARED_DRIVE | &quot;SHARED_DRIVE&quot; |



## Enum: SearchMethodEnum

| Name | Value |
|---- | -----|
| SEARCH_METHOD_UNSPECIFIED | &quot;SEARCH_METHOD_UNSPECIFIED&quot; |
| ACCOUNT | &quot;ACCOUNT&quot; |
| ORG_UNIT | &quot;ORG_UNIT&quot; |
| TEAM_DRIVE | &quot;TEAM_DRIVE&quot; |
| ENTIRE_ORG | &quot;ENTIRE_ORG&quot; |
| ROOM | &quot;ROOM&quot; |
| SITES_URL | &quot;SITES_URL&quot; |
| SHARED_DRIVE | &quot;SHARED_DRIVE&quot; |



