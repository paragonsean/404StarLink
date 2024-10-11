# ListWavesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**filters** | [**ListWavesRequestFilters**](ListWavesRequestFilters.md) |  | [optional] 
**max_results** | **int** | Maximum results to return when listing waves. | [optional] 
**next_token** | **str** | Request next token. | [optional] 

## Example

```python
from openapi_client.models.list_waves_request import ListWavesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ListWavesRequest from a JSON string
list_waves_request_instance = ListWavesRequest.from_json(json)
# print the JSON string representation of the object
print(ListWavesRequest.to_json())

# convert the object into a dict
list_waves_request_dict = list_waves_request_instance.to_dict()
# create an instance of ListWavesRequest from a dict
list_waves_request_from_dict = ListWavesRequest.from_dict(list_waves_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


