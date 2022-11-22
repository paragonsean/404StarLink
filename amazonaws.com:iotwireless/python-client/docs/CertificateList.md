# CertificateList

List of sidewalk certificates.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**signing_alg** | [**SigningAlg**](SigningAlg.md) |  | 
**value** | **str** |  | 

## Example

```python
from openapi_client.models.certificate_list import CertificateList

# TODO update the JSON string below
json = "{}"
# create an instance of CertificateList from a JSON string
certificate_list_instance = CertificateList.from_json(json)
# print the JSON string representation of the object
print(CertificateList.to_json())

# convert the object into a dict
certificate_list_dict = certificate_list_instance.to_dict()
# create an instance of CertificateList from a dict
certificate_list_from_dict = CertificateList.from_dict(certificate_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


