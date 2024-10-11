# ConsentArtefactResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**consent** | [**ConsentArtefactResponseConsent**](ConsentArtefactResponseConsent.md) |  | [optional] 
**error** | [**Error**](Error.md) |  | [optional] 
**request_id** | **str** | a nonce, unique for each HTTP request | 
**resp** | [**RequestReference**](RequestReference.md) |  | 
**timestamp** | **datetime** | Date time format in UTC, includes miliseconds YYYY-MM-DDThh:mm:ss.vZ | 

## Example

```python
from openapi_client.models.consent_artefact_response import ConsentArtefactResponse

# TODO update the JSON string below
json = "{}"
# create an instance of ConsentArtefactResponse from a JSON string
consent_artefact_response_instance = ConsentArtefactResponse.from_json(json)
# print the JSON string representation of the object
print(ConsentArtefactResponse.to_json())

# convert the object into a dict
consent_artefact_response_dict = consent_artefact_response_instance.to_dict()
# create an instance of ConsentArtefactResponse from a dict
consent_artefact_response_from_dict = ConsentArtefactResponse.from_dict(consent_artefact_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


