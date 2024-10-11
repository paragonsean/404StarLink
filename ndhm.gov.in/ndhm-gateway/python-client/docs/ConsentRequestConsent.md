# ConsentRequestConsent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**care_contexts** | [**List[CareContextDefinition]**](CareContextDefinition.md) |  | [optional] 
**hi_types** | [**List[HITypeEnum]**](HITypeEnum.md) |  | 
**hip** | [**ConsentArtefactResponseConsentConsentDetailHip**](ConsentArtefactResponseConsentConsentDetailHip.md) |  | [optional] 
**hiu** | [**ConsentArtefactResponseConsentConsentDetailHiu**](ConsentArtefactResponseConsentConsentDetailHiu.md) |  | 
**patient** | [**ConsentRequestConsentPatient**](ConsentRequestConsentPatient.md) |  | 
**permission** | [**Permission**](Permission.md) |  | 
**purpose** | [**UsePurpose**](UsePurpose.md) |  | 
**requester** | [**Requester**](Requester.md) |  | 

## Example

```python
from openapi_client.models.consent_request_consent import ConsentRequestConsent

# TODO update the JSON string below
json = "{}"
# create an instance of ConsentRequestConsent from a JSON string
consent_request_consent_instance = ConsentRequestConsent.from_json(json)
# print the JSON string representation of the object
print(ConsentRequestConsent.to_json())

# convert the object into a dict
consent_request_consent_dict = consent_request_consent_instance.to_dict()
# create an instance of ConsentRequestConsent from a dict
consent_request_consent_from_dict = ConsentRequestConsent.from_dict(consent_request_consent_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


