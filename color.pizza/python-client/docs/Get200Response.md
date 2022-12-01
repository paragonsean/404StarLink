# Get200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**colors** | [**List[Color]**](Color.md) |  | [optional] 
**palette_title** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.get200_response import Get200Response

# TODO update the JSON string below
json = "{}"
# create an instance of Get200Response from a JSON string
get200_response_instance = Get200Response.from_json(json)
# print the JSON string representation of the object
print(Get200Response.to_json())

# convert the object into a dict
get200_response_dict = get200_response_instance.to_dict()
# create an instance of Get200Response from a dict
get200_response_from_dict = Get200Response.from_dict(get200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


