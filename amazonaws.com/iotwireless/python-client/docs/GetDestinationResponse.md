# GetDestinationResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**expression** | **str** |  | [optional] 
**expression_type** | [**ExpressionType**](ExpressionType.md) |  | [optional] 
**description** | **str** |  | [optional] 
**role_arn** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.get_destination_response import GetDestinationResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetDestinationResponse from a JSON string
get_destination_response_instance = GetDestinationResponse.from_json(json)
# print the JSON string representation of the object
print(GetDestinationResponse.to_json())

# convert the object into a dict
get_destination_response_dict = get_destination_response_instance.to_dict()
# create an instance of GetDestinationResponse from a dict
get_destination_response_from_dict = GetDestinationResponse.from_dict(get_destination_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


