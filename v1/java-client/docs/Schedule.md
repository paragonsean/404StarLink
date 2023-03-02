

# Schedule

The definition of a schedule.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**createTime** | **String** | Output only. Time the schedule was created. |  [optional] [readonly] |
|**cronSchedule** | **String** | Cron-tab formatted schedule by which the job will execute. Format: minute, hour, day of month, month, day of week, e.g. &#x60;0 0 * * WED&#x60; &#x3D; every Wednesday More examples: https://crontab.guru/examples.html |  [optional] |
|**description** | **String** | A brief description of this environment. |  [optional] |
|**displayName** | **String** | Output only. Display name used for UI purposes. Name can only contain alphanumeric characters, hyphens &#x60;-&#x60;, and underscores &#x60;_&#x60;. |  [optional] [readonly] |
|**executionTemplate** | [**ExecutionTemplate**](ExecutionTemplate.md) |  |  [optional] |
|**name** | **String** | Output only. The name of this schedule. Format: &#x60;projects/{project_id}/locations/{location}/schedules/{schedule_id}&#x60; |  [optional] [readonly] |
|**recentExecutions** | [**List&lt;Execution&gt;**](Execution.md) | Output only. The most recent execution names triggered from this schedule and their corresponding states. |  [optional] [readonly] |
|**state** | [**StateEnum**](#StateEnum) |  |  [optional] |
|**timeZone** | **String** | Timezone on which the cron_schedule. The value of this field must be a time zone name from the tz database. TZ Database: https://en.wikipedia.org/wiki/List_of_tz_database_time_zones Note that some time zones include a provision for daylight savings time. The rules for daylight saving time are determined by the chosen tz. For UTC use the string \&quot;utc\&quot;. If a time zone is not specified, the default will be in UTC (also known as GMT). |  [optional] |
|**updateTime** | **String** | Output only. Time the schedule was last updated. |  [optional] [readonly] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| STATE_UNSPECIFIED | &quot;STATE_UNSPECIFIED&quot; |
| ENABLED | &quot;ENABLED&quot; |
| PAUSED | &quot;PAUSED&quot; |
| DISABLED | &quot;DISABLED&quot; |
| UPDATE_FAILED | &quot;UPDATE_FAILED&quot; |
| INITIALIZING | &quot;INITIALIZING&quot; |
| DELETING | &quot;DELETING&quot; |



