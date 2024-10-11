# FinalizeCutoverRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**source_server_id** | **str** | Request to finalize Cutover by Source Server ID. | 

## Example

```python
from openapi_client.models.finalize_cutover_request import FinalizeCutoverRequest

# TODO update the JSON string below
json = "{}"
# create an instance of FinalizeCutoverRequest from a JSON string
finalize_cutover_request_instance = FinalizeCutoverRequest.from_json(json)
# print the JSON string representation of the object
print(FinalizeCutoverRequest.to_json())

# convert the object into a dict
finalize_cutover_request_dict = finalize_cutover_request_instance.to_dict()
# create an instance of FinalizeCutoverRequest from a dict
finalize_cutover_request_from_dict = FinalizeCutoverRequest.from_dict(finalize_cutover_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


