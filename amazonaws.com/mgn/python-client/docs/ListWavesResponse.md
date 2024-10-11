# ListWavesResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**items** | **List** |  | [optional] 
**next_token** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.list_waves_response import ListWavesResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ListWavesResponse from a JSON string
list_waves_response_instance = ListWavesResponse.from_json(json)
# print the JSON string representation of the object
print(ListWavesResponse.to_json())

# convert the object into a dict
list_waves_response_dict = list_waves_response_instance.to_dict()
# create an instance of ListWavesResponse from a dict
list_waves_response_from_dict = ListWavesResponse.from_dict(list_waves_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


