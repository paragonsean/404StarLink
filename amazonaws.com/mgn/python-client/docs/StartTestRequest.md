# StartTestRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_server_ids** | **List[str]** | Start Test for Source Server IDs. | 
**tags** | **Dict[str, str]** | Start Test by Tags. | [optional] 

## Example

```python
from openapi_client.models.start_test_request import StartTestRequest

# TODO update the JSON string below
json = "{}"
# create an instance of StartTestRequest from a JSON string
start_test_request_instance = StartTestRequest.from_json(json)
# print the JSON string representation of the object
print(StartTestRequest.to_json())

# convert the object into a dict
start_test_request_dict = start_test_request_instance.to_dict()
# create an instance of StartTestRequest from a dict
start_test_request_from_dict = StartTestRequest.from_dict(start_test_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


