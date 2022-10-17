# QueueTransition

Description of the source and destination queues between which the job has moved, along with the timestamp of the move

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**destination_queue** | **str** |  | [optional] 
**source_queue** | **str** |  | [optional] 
**timestamp** | **datetime** |  | [optional] 

## Example

```python
from openapi_client.models.queue_transition import QueueTransition

# TODO update the JSON string below
json = "{}"
# create an instance of QueueTransition from a JSON string
queue_transition_instance = QueueTransition.from_json(json)
# print the JSON string representation of the object
print(QueueTransition.to_json())

# convert the object into a dict
queue_transition_dict = queue_transition_instance.to_dict()
# create an instance of QueueTransition from a dict
queue_transition_from_dict = QueueTransition.from_dict(queue_transition_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


