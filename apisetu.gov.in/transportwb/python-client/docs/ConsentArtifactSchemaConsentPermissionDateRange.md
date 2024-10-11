# ConsentArtifactSchemaConsentPermissionDateRange


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**var_from** | **datetime** | Date time format in UTC, includes miliseconds YYYY-MM-DDThh:mm:ss.vZ | 
**to** | **datetime** | Date time format in UTC, includes miliseconds YYYY-MM-DDThh:mm:ss.vZ | 

## Example

```python
from openapi_client.models.consent_artifact_schema_consent_permission_date_range import ConsentArtifactSchemaConsentPermissionDateRange

# TODO update the JSON string below
json = "{}"
# create an instance of ConsentArtifactSchemaConsentPermissionDateRange from a JSON string
consent_artifact_schema_consent_permission_date_range_instance = ConsentArtifactSchemaConsentPermissionDateRange.from_json(json)
# print the JSON string representation of the object
print(ConsentArtifactSchemaConsentPermissionDateRange.to_json())

# convert the object into a dict
consent_artifact_schema_consent_permission_date_range_dict = consent_artifact_schema_consent_permission_date_range_instance.to_dict()
# create an instance of ConsentArtifactSchemaConsentPermissionDateRange from a dict
consent_artifact_schema_consent_permission_date_range_from_dict = ConsentArtifactSchemaConsentPermissionDateRange.from_dict(consent_artifact_schema_consent_permission_date_range_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


