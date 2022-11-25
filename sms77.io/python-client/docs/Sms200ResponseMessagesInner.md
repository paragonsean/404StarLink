# Sms200ResponseMessagesInner


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**encoding** | **str** |  | [optional] 
**error** | **str** |  | [optional] 
**error_text** | **str** |  | [optional] 
**id** | **str** |  | [optional] 
**messages** | **List[str]** |  | [optional] 
**parts** | **int** |  | [optional] 
**price** | **int** |  | [optional] 
**recipient** | **str** |  | [optional] 
**sender** | **str** |  | [optional] 
**success** | **bool** |  | [optional] 
**text** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.sms200_response_messages_inner import Sms200ResponseMessagesInner

# TODO update the JSON string below
json = "{}"
# create an instance of Sms200ResponseMessagesInner from a JSON string
sms200_response_messages_inner_instance = Sms200ResponseMessagesInner.from_json(json)
# print the JSON string representation of the object
print(Sms200ResponseMessagesInner.to_json())

# convert the object into a dict
sms200_response_messages_inner_dict = sms200_response_messages_inner_instance.to_dict()
# create an instance of Sms200ResponseMessagesInner from a dict
sms200_response_messages_inner_from_dict = Sms200ResponseMessagesInner.from_dict(sms200_response_messages_inner_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


