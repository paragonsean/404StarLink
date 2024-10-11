# CreateQueueResponseQueue


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**created_at** | **datetime** |  | [optional] 
**description** | **str** |  | [optional] 
**last_updated** | **datetime** |  | [optional] 
**name** | **str** |  | 
**pricing_plan** | [**PricingPlan**](PricingPlan.md) |  | [optional] 
**progressing_jobs_count** | **int** |  | [optional] 
**reservation_plan** | [**QueueReservationPlan**](QueueReservationPlan.md) |  | [optional] 
**status** | [**QueueStatus**](QueueStatus.md) |  | [optional] 
**submitted_jobs_count** | **int** |  | [optional] 
**type** | [**Type**](Type.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_queue_response_queue import CreateQueueResponseQueue

# TODO update the JSON string below
json = "{}"
# create an instance of CreateQueueResponseQueue from a JSON string
create_queue_response_queue_instance = CreateQueueResponseQueue.from_json(json)
# print the JSON string representation of the object
print(CreateQueueResponseQueue.to_json())

# convert the object into a dict
create_queue_response_queue_dict = create_queue_response_queue_instance.to_dict()
# create an instance of CreateQueueResponseQueue from a dict
create_queue_response_queue_from_dict = CreateQueueResponseQueue.from_dict(create_queue_response_queue_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


