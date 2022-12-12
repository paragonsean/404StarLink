# ConsentArtefactResponseConsentConsentDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**care_contexts** | [**List[ConsentArtefactResponseConsentConsentDetailCareContextsInner]**](ConsentArtefactResponseConsentConsentDetailCareContextsInner.md) |  | 
**consent_id** | **str** |  | 
**consent_manager** | [**ConsentArtefactResponseConsentConsentDetailConsentManager**](ConsentArtefactResponseConsentConsentDetailConsentManager.md) |  | 
**created_at** | **datetime** |  | 
**hi_types** | [**List[HITypeEnum]**](HITypeEnum.md) |  | 
**hip** | [**ConsentArtefactResponseConsentConsentDetailHip**](ConsentArtefactResponseConsentConsentDetailHip.md) |  | 
**hiu** | [**ConsentArtefactResponseConsentConsentDetailHiu**](ConsentArtefactResponseConsentConsentDetailHiu.md) |  | 
**patient** | [**ConsentManagerPatientID**](ConsentManagerPatientID.md) |  | 
**permission** | [**Permission**](Permission.md) |  | 
**purpose** | [**UsePurpose**](UsePurpose.md) |  | 
**requester** | [**Requester**](Requester.md) |  | [optional] 
**schema_version** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.consent_artefact_response_consent_consent_detail import ConsentArtefactResponseConsentConsentDetail

# TODO update the JSON string below
json = "{}"
# create an instance of ConsentArtefactResponseConsentConsentDetail from a JSON string
consent_artefact_response_consent_consent_detail_instance = ConsentArtefactResponseConsentConsentDetail.from_json(json)
# print the JSON string representation of the object
print(ConsentArtefactResponseConsentConsentDetail.to_json())

# convert the object into a dict
consent_artefact_response_consent_consent_detail_dict = consent_artefact_response_consent_consent_detail_instance.to_dict()
# create an instance of ConsentArtefactResponseConsentConsentDetail from a dict
consent_artefact_response_consent_consent_detail_from_dict = ConsentArtefactResponseConsentConsentDetail.from_dict(consent_artefact_response_consent_consent_detail_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


