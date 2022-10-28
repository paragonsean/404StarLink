# ConsentArtifactSchemaConsentUser


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email** | **str** |  | 
**id_number** | **str** |  | 
**id_type** | **str** |  | 
**mobile** | **str** |  | 

## Example

```python
from openapi_client.models.consent_artifact_schema_consent_user import ConsentArtifactSchemaConsentUser

# TODO update the JSON string below
json = "{}"
# create an instance of ConsentArtifactSchemaConsentUser from a JSON string
consent_artifact_schema_consent_user_instance = ConsentArtifactSchemaConsentUser.from_json(json)
# print the JSON string representation of the object
print(ConsentArtifactSchemaConsentUser.to_json())

# convert the object into a dict
consent_artifact_schema_consent_user_dict = consent_artifact_schema_consent_user_instance.to_dict()
# create an instance of ConsentArtifactSchemaConsentUser from a dict
consent_artifact_schema_consent_user_from_dict = ConsentArtifactSchemaConsentUser.from_dict(consent_artifact_schema_consent_user_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


