# Sms200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**balance** | **float** |  | [optional] 
**debug** | **str** |  | [optional] 
**messages** | [**List[Sms200ResponseMessagesInner]**](Sms200ResponseMessagesInner.md) |  | [optional] 
**sms_type** | **str** |  | [optional] 
**success** | **str** |  | [optional] 
**total_price** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.sms200_response import Sms200Response

# TODO update the JSON string below
json = "{}"
# create an instance of Sms200Response from a JSON string
sms200_response_instance = Sms200Response.from_json(json)
# print the JSON string representation of the object
print(Sms200Response.to_json())

# convert the object into a dict
sms200_response_dict = sms200_response_instance.to_dict()
# create an instance of Sms200Response from a dict
sms200_response_from_dict = Sms200Response.from_dict(sms200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


