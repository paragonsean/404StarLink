# CreateQueueRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **str** | Optional. A description of the queue that you are creating. | [optional] 
**name** | **str** | The name of the queue that you are creating. | 
**pricing_plan** | **str** | Specifies whether the pricing plan for the queue is on-demand or reserved. For on-demand, you pay per minute, billed in increments of .01 minute. For reserved, you pay for the transcoding capacity of the entire queue, regardless of how much or how little you use it. Reserved pricing requires a 12-month commitment. | [optional] 
**reservation_plan_settings** | [**CreateQueueRequestReservationPlanSettings**](CreateQueueRequestReservationPlanSettings.md) |  | [optional] 
**status** | **str** | Queues can be ACTIVE or PAUSED. If you pause a queue, jobs in that queue won&#39;t begin. Jobs that are running when you pause a queue continue to run until they finish or result in an error. | [optional] 
**tags** | **Dict[str, str]** | The tags that you want to add to the resource. You can tag resources with a key-value pair or with only a key. | [optional] 

## Example

```python
from openapi_client.models.create_queue_request import CreateQueueRequest

# TODO update the JSON string below
json = "{}"
# create an instance of CreateQueueRequest from a JSON string
create_queue_request_instance = CreateQueueRequest.from_json(json)
# print the JSON string representation of the object
print(CreateQueueRequest.to_json())

# convert the object into a dict
create_queue_request_dict = create_queue_request_instance.to_dict()
# create an instance of CreateQueueRequest from a dict
create_queue_request_from_dict = CreateQueueRequest.from_dict(create_queue_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


