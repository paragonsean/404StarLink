# ConsentArtifactSchemaConsent


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**consent_id** | **str** | A unique consent id in UUID format. | 
**data** | [**ConsentArtifactSchemaConsentData**](ConsentArtifactSchemaConsentData.md) |  | 
**data_consumer** | [**ConsentArtifactSchemaConsentData**](ConsentArtifactSchemaConsentData.md) |  | 
**data_provider** | [**ConsentArtifactSchemaConsentData**](ConsentArtifactSchemaConsentData.md) |  | 
**permission** | [**ConsentArtifactSchemaConsentPermission**](ConsentArtifactSchemaConsentPermission.md) |  | 
**purpose** | [**ConsentArtifactSchemaConsentPurpose**](ConsentArtifactSchemaConsentPurpose.md) |  | 
**timestamp** | **datetime** | Date time format in UTC, includes miliseconds YYYY-MM-DDThh:mm:ss.vZ | 
**user** | [**ConsentArtifactSchemaConsentUser**](ConsentArtifactSchemaConsentUser.md) |  | 

## Example

```python
from openapi_client.models.consent_artifact_schema_consent import ConsentArtifactSchemaConsent

# TODO update the JSON string below
json = "{}"
# create an instance of ConsentArtifactSchemaConsent from a JSON string
consent_artifact_schema_consent_instance = ConsentArtifactSchemaConsent.from_json(json)
# print the JSON string representation of the object
print(ConsentArtifactSchemaConsent.to_json())

# convert the object into a dict
consent_artifact_schema_consent_dict = consent_artifact_schema_consent_instance.to_dict()
# create an instance of ConsentArtifactSchemaConsent from a dict
consent_artifact_schema_consent_from_dict = ConsentArtifactSchemaConsent.from_dict(consent_artifact_schema_consent_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


