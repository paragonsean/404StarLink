# WiFiAccessPoint

Wi-Fi access point.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**mac_address** | **str** |  | 
**rss** | **int** |  | 

## Example

```python
from openapi_client.models.wi_fi_access_point import WiFiAccessPoint

# TODO update the JSON string below
json = "{}"
# create an instance of WiFiAccessPoint from a JSON string
wi_fi_access_point_instance = WiFiAccessPoint.from_json(json)
# print the JSON string representation of the object
print(WiFiAccessPoint.to_json())

# convert the object into a dict
wi_fi_access_point_dict = wi_fi_access_point_instance.to_dict()
# create an instance of WiFiAccessPoint from a dict
wi_fi_access_point_from_dict = WiFiAccessPoint.from_dict(wi_fi_access_point_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


