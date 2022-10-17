# UpdateQueueRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | The new description for the queue, if you are changing it. | [optional] 
**reservation_plan_settings** | [**CreateQueueRequestReservationPlanSettings**](CreateQueueRequestReservationPlanSettings.md) |  | [optional] 
**status** | **str** | Queues can be ACTIVE or PAUSED. If you pause a queue, jobs in that queue won&#39;t begin. Jobs that are running when you pause a queue continue to run until they finish or result in an error. | [optional] 

## Example

```python
from openapi_client.models.update_queue_request import UpdateQueueRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateQueueRequest from a JSON string
update_queue_request_instance = UpdateQueueRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateQueueRequest.to_json())

# convert the object into a dict
update_queue_request_dict = update_queue_request_instance.to_dict()
# create an instance of UpdateQueueRequest from a dict
update_queue_request_from_dict = UpdateQueueRequest.from_dict(update_queue_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


