# StartCutoverRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_server_ids** | **List[str]** | Start Cutover by Source Server IDs. | 
**tags** | **Dict[str, str]** | Start Cutover by Tags. | [optional] 

## Example

```python
from openapi_client.models.start_cutover_request import StartCutoverRequest

# TODO update the JSON string below
json = "{}"
# create an instance of StartCutoverRequest from a JSON string
start_cutover_request_instance = StartCutoverRequest.from_json(json)
# print the JSON string representation of the object
print(StartCutoverRequest.to_json())

# convert the object into a dict
start_cutover_request_dict = start_cutover_request_instance.to_dict()
# create an instance of StartCutoverRequest from a dict
start_cutover_request_from_dict = StartCutoverRequest.from_dict(start_cutover_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


