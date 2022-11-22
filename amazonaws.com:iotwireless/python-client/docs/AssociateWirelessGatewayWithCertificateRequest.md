# AssociateWirelessGatewayWithCertificateRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iot_certificate_id** | **str** | The ID of the certificate to associate with the wireless gateway. | 

## Example

```python
from openapi_client.models.associate_wireless_gateway_with_certificate_request import AssociateWirelessGatewayWithCertificateRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AssociateWirelessGatewayWithCertificateRequest from a JSON string
associate_wireless_gateway_with_certificate_request_instance = AssociateWirelessGatewayWithCertificateRequest.from_json(json)
# print the JSON string representation of the object
print(AssociateWirelessGatewayWithCertificateRequest.to_json())

# convert the object into a dict
associate_wireless_gateway_with_certificate_request_dict = associate_wireless_gateway_with_certificate_request_instance.to_dict()
# create an instance of AssociateWirelessGatewayWithCertificateRequest from a dict
associate_wireless_gateway_with_certificate_request_from_dict = AssociateWirelessGatewayWithCertificateRequest.from_dict(associate_wireless_gateway_with_certificate_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


