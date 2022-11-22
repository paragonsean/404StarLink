# LoRaWANGatewayVersion

LoRaWANGatewayVersion object.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**package_version** | **str** |  | [optional] 
**model** | **str** |  | [optional] 
**station** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.lo_ra_wan_gateway_version import LoRaWANGatewayVersion

# TODO update the JSON string below
json = "{}"
# create an instance of LoRaWANGatewayVersion from a JSON string
lo_ra_wan_gateway_version_instance = LoRaWANGatewayVersion.from_json(json)
# print the JSON string representation of the object
print(LoRaWANGatewayVersion.to_json())

# convert the object into a dict
lo_ra_wan_gateway_version_dict = lo_ra_wan_gateway_version_instance.to_dict()
# create an instance of LoRaWANGatewayVersion from a dict
lo_ra_wan_gateway_version_from_dict = LoRaWANGatewayVersion.from_dict(lo_ra_wan_gateway_version_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


