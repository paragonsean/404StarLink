# CreateJobResponseJob


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceleration_settings** | [**JobAccelerationSettings**](JobAccelerationSettings.md) |  | [optional] 
**acceleration_status** | [**AccelerationStatus**](AccelerationStatus.md) |  | [optional] 
**arn** | **str** |  | [optional] 
**billing_tags_source** | [**BillingTagsSource**](BillingTagsSource.md) |  | [optional] 
**client_request_token** | **str** |  | [optional] 
**created_at** | **datetime** |  | [optional] 
**current_phase** | [**JobPhase**](JobPhase.md) |  | [optional] 
**error_code** | **int** |  | [optional] 
**error_message** | **str** |  | [optional] 
**hop_destinations** | **List** |  | [optional] 
**id** | **str** |  | [optional] 
**job_percent_complete** | **int** |  | [optional] 
**job_template** | **str** |  | [optional] 
**messages** | [**JobMessages**](JobMessages.md) |  | [optional] 
**output_group_details** | **List** |  | [optional] 
**priority** | **int** |  | [optional] 
**queue** | **str** |  | [optional] 
**queue_transitions** | **List** |  | [optional] 
**retry_count** | **int** |  | [optional] 
**role** | **str** |  | 
**settings** | [**CreateJobRequestSettings**](CreateJobRequestSettings.md) |  | 
**simulate_reserved_queue** | [**SimulateReservedQueue**](SimulateReservedQueue.md) |  | [optional] 
**status** | [**JobStatus**](JobStatus.md) |  | [optional] 
**status_update_interval** | [**StatusUpdateInterval**](StatusUpdateInterval.md) |  | [optional] 
**timing** | [**JobTiming**](JobTiming.md) |  | [optional] 
**user_metadata** | **Dict** |  | [optional] 
**warnings** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.create_job_response_job import CreateJobResponseJob

# TODO update the JSON string below
json = "{}"
# create an instance of CreateJobResponseJob from a JSON string
create_job_response_job_instance = CreateJobResponseJob.from_json(json)
# print the JSON string representation of the object
print(CreateJobResponseJob.to_json())

# convert the object into a dict
create_job_response_job_dict = create_job_response_job_instance.to_dict()
# create an instance of CreateJobResponseJob from a dict
create_job_response_job_from_dict = CreateJobResponseJob.from_dict(create_job_response_job_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


