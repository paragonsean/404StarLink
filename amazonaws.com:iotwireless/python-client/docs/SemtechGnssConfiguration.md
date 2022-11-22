# SemtechGnssConfiguration

Information about the Semtech GNSS solver configuration.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**PositionConfigurationStatus**](PositionConfigurationStatus.md) |  | 
**fec** | [**PositionConfigurationFec**](PositionConfigurationFec.md) |  | 

## Example

```python
from openapi_client.models.semtech_gnss_configuration import SemtechGnssConfiguration

# TODO update the JSON string below
json = "{}"
# create an instance of SemtechGnssConfiguration from a JSON string
semtech_gnss_configuration_instance = SemtechGnssConfiguration.from_json(json)
# print the JSON string representation of the object
print(SemtechGnssConfiguration.to_json())

# convert the object into a dict
semtech_gnss_configuration_dict = semtech_gnss_configuration_instance.to_dict()
# create an instance of SemtechGnssConfiguration from a dict
semtech_gnss_configuration_from_dict = SemtechGnssConfiguration.from_dict(semtech_gnss_configuration_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


