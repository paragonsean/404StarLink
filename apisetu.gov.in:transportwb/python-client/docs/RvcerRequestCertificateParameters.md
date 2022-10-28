# RvcerRequestCertificateParameters


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**full_name** | **str** | Full name | 
**uid** | **str** | Aadhaar number | 
**chasis_no** | **str** | Chassis No | 
**reg_no** | **str** | Vehicle Registration No | 

## Example

```python
from openapi_client.models.rvcer_request_certificate_parameters import RvcerRequestCertificateParameters

# TODO update the JSON string below
json = "{}"
# create an instance of RvcerRequestCertificateParameters from a JSON string
rvcer_request_certificate_parameters_instance = RvcerRequestCertificateParameters.from_json(json)
# print the JSON string representation of the object
print(RvcerRequestCertificateParameters.to_json())

# convert the object into a dict
rvcer_request_certificate_parameters_dict = rvcer_request_certificate_parameters_instance.to_dict()
# create an instance of RvcerRequestCertificateParameters from a dict
rvcer_request_certificate_parameters_from_dict = RvcerRequestCertificateParameters.from_dict(rvcer_request_certificate_parameters_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


