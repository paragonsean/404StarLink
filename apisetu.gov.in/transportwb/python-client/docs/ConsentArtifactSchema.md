# ConsentArtifactSchema


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**consent** | [**ConsentArtifactSchemaConsent**](ConsentArtifactSchemaConsent.md) |  | 
**signature** | [**ConsentArtifactSchemaSignature**](ConsentArtifactSchemaSignature.md) |  | 

## Example

```python
from openapi_client.models.consent_artifact_schema import ConsentArtifactSchema

# TODO update the JSON string below
json = "{}"
# create an instance of ConsentArtifactSchema from a JSON string
consent_artifact_schema_instance = ConsentArtifactSchema.from_json(json)
# print the JSON string representation of the object
print(ConsentArtifactSchema.to_json())

# convert the object into a dict
consent_artifact_schema_dict = consent_artifact_schema_instance.to_dict()
# create an instance of ConsentArtifactSchema from a dict
consent_artifact_schema_from_dict = ConsentArtifactSchema.from_dict(consent_artifact_schema_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


