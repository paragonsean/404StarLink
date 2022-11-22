# DakCertificateMetadata

The device attestation key (DAK) information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**certificate_id** | **str** |  | 
**max_allowed_signature** | **int** |  | [optional] 
**factory_support** | **bool** |  | [optional] 
**ap_id** | **str** |  | [optional] 
**device_type_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.dak_certificate_metadata import DakCertificateMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of DakCertificateMetadata from a JSON string
dak_certificate_metadata_instance = DakCertificateMetadata.from_json(json)
# print the JSON string representation of the object
print(DakCertificateMetadata.to_json())

# convert the object into a dict
dak_certificate_metadata_dict = dak_certificate_metadata_instance.to_dict()
# create an instance of DakCertificateMetadata from a dict
dak_certificate_metadata_from_dict = DakCertificateMetadata.from_dict(dak_certificate_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


