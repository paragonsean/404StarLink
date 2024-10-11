# Thread

Thread

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** |  | 
**last_read_at** | **str** |  | 
**reason** | **str** |  | 
**repository** | [**MinimalRepository**](MinimalRepository.md) |  | 
**subject** | [**ThreadSubject**](ThreadSubject.md) |  | 
**subscription_url** | **str** |  | 
**unread** | **bool** |  | 
**updated_at** | **str** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.thread import Thread

# TODO update the JSON string below
json = "{}"
# create an instance of Thread from a JSON string
thread_instance = Thread.from_json(json)
# print the JSON string representation of the object
print(Thread.to_json())

# convert the object into a dict
thread_dict = thread_instance.to_dict()
# create an instance of Thread from a dict
thread_from_dict = Thread.from_dict(thread_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


