# ThreadSubject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**latest_comment_url** | **str** |  | 
**title** | **str** |  | 
**type** | **str** |  | 
**url** | **str** |  | 

## Example

```python
from openapi_client.models.thread_subject import ThreadSubject

# TODO update the JSON string below
json = "{}"
# create an instance of ThreadSubject from a JSON string
thread_subject_instance = ThreadSubject.from_json(json)
# print the JSON string representation of the object
print(ThreadSubject.to_json())

# convert the object into a dict
thread_subject_dict = thread_subject_instance.to_dict()
# create an instance of ThreadSubject from a dict
thread_subject_from_dict = ThreadSubject.from_dict(thread_subject_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


