# LoRaWANGatewayMetadata

LoRaWAN gateway metatdata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**gateway_eui** | **str** |  | [optional] 
**snr** | **float** |  | [optional] 
**rssi** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.lo_ra_wan_gateway_metadata import LoRaWANGatewayMetadata

# TODO update the JSON string below
json = "{}"
# create an instance of LoRaWANGatewayMetadata from a JSON string
lo_ra_wan_gateway_metadata_instance = LoRaWANGatewayMetadata.from_json(json)
# print the JSON string representation of the object
print(LoRaWANGatewayMetadata.to_json())

# convert the object into a dict
lo_ra_wan_gateway_metadata_dict = lo_ra_wan_gateway_metadata_instance.to_dict()
# create an instance of LoRaWANGatewayMetadata from a dict
lo_ra_wan_gateway_metadata_from_dict = LoRaWANGatewayMetadata.from_dict(lo_ra_wan_gateway_metadata_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


