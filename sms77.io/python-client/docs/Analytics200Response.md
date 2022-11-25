# Analytics200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_date** | **str** |  | [optional] 
**direct** | **int** |  | [optional] 
**economy** | **int** |  | [optional] 
**hlr** | **int** |  | [optional] 
**inbound** | **int** |  | [optional] 
**mnp** | **int** |  | [optional] 
**usage_eur** | **float** |  | [optional] 
**voice** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.analytics200_response import Analytics200Response

# TODO update the JSON string below
json = "{}"
# create an instance of Analytics200Response from a JSON string
analytics200_response_instance = Analytics200Response.from_json(json)
# print the JSON string representation of the object
print(Analytics200Response.to_json())

# convert the object into a dict
analytics200_response_dict = analytics200_response_instance.to_dict()
# create an instance of Analytics200Response from a dict
analytics200_response_from_dict = Analytics200Response.from_dict(analytics200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


