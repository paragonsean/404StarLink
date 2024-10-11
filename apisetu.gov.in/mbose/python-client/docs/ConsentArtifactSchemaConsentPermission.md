# ConsentArtifactSchemaConsentPermission


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**access** | **str** |  | 
**date_range** | [**ConsentArtifactSchemaConsentPermissionDateRange**](ConsentArtifactSchemaConsentPermissionDateRange.md) |  | 
**frequency** | [**ConsentArtifactSchemaConsentPermissionFrequency**](ConsentArtifactSchemaConsentPermissionFrequency.md) |  | 

## Example

```python
from openapi_client.models.consent_artifact_schema_consent_permission import ConsentArtifactSchemaConsentPermission

# TODO update the JSON string below
json = "{}"
# create an instance of ConsentArtifactSchemaConsentPermission from a JSON string
consent_artifact_schema_consent_permission_instance = ConsentArtifactSchemaConsentPermission.from_json(json)
# print the JSON string representation of the object
print(ConsentArtifactSchemaConsentPermission.to_json())

# convert the object into a dict
consent_artifact_schema_consent_permission_dict = consent_artifact_schema_consent_permission_instance.to_dict()
# create an instance of ConsentArtifactSchemaConsentPermission from a dict
consent_artifact_schema_consent_permission_from_dict = ConsentArtifactSchemaConsentPermission.from_dict(consent_artifact_schema_consent_permission_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


