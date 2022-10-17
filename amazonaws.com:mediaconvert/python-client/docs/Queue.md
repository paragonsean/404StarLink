# Queue

You can use queues to manage the resources that are available to your AWS account for running multiple transcoding jobs at the same time. If you don't specify a queue, the service sends all jobs through the default queue. For more information, see https://docs.aws.amazon.com/mediaconvert/latest/ug/working-with-queues.html.

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
from openapi_client.models.queue import Queue

# TODO update the JSON string below
json = "{}"
# create an instance of Queue from a JSON string
queue_instance = Queue.from_json(json)
# print the JSON string representation of the object
print(Queue.to_json())

# convert the object into a dict
queue_dict = queue_instance.to_dict()
# create an instance of Queue from a dict
queue_from_dict = Queue.from_dict(queue_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


