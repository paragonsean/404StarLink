# CreateQueueResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**queue** | [**CreateQueueResponseQueue**](CreateQueueResponseQueue.md) |  | [optional] 

## Example

```python
from openapi_client.models.create_queue_response import CreateQueueResponse

# TODO update the JSON string below
json = "{}"
# create an instance of CreateQueueResponse from a JSON string
create_queue_response_instance = CreateQueueResponse.from_json(json)
# print the JSON string representation of the object
print(CreateQueueResponse.to_json())

# convert the object into a dict
create_queue_response_dict = create_queue_response_instance.to_dict()
# create an instance of CreateQueueResponse from a dict
create_queue_response_from_dict = CreateQueueResponse.from_dict(create_queue_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


