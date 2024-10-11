# AssociateCertificateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** | The ARN of the ACM certificate that you want to associate with your MediaConvert resource. | 

## Example

```python
from openapi_client.models.associate_certificate_request import AssociateCertificateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AssociateCertificateRequest from a JSON string
associate_certificate_request_instance = AssociateCertificateRequest.from_json(json)
# print the JSON string representation of the object
print(AssociateCertificateRequest.to_json())

# convert the object into a dict
associate_certificate_request_dict = associate_certificate_request_instance.to_dict()
# create an instance of AssociateCertificateRequest from a dict
associate_certificate_request_from_dict = AssociateCertificateRequest.from_dict(associate_certificate_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


