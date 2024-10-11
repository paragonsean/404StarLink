# ValidateForVoice200Response


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **str** |  | [optional] 
**error** | **str** |  | [optional] 
**success** | **bool** |  | [optional] 

## Example

```python
from openapi_client.models.validate_for_voice200_response import ValidateForVoice200Response

# TODO update the JSON string below
json = "{}"
# create an instance of ValidateForVoice200Response from a JSON string
validate_for_voice200_response_instance = ValidateForVoice200Response.from_json(json)
# print the JSON string representation of the object
print(ValidateForVoice200Response.to_json())

# convert the object into a dict
validate_for_voice200_response_dict = validate_for_voice200_response_instance.to_dict()
# create an instance of ValidateForVoice200Response from a dict
validate_for_voice200_response_from_dict = ValidateForVoice200Response.from_dict(validate_for_voice200_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


