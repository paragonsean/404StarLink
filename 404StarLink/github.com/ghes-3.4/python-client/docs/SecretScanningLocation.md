# SecretScanningLocation


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**details** | [**SecretScanningLocationDetails**](SecretScanningLocationDetails.md) |  | 
**type** | **str** | The location type. Because secrets may be found in different types of resources (ie. code, comments, issues), this field identifies the type of resource where the secret was found. | 

## Example

```python
from openapi_client.models.secret_scanning_location import SecretScanningLocation

# TODO update the JSON string below
json = "{}"
# create an instance of SecretScanningLocation from a JSON string
secret_scanning_location_instance = SecretScanningLocation.from_json(json)
# print the JSON string representation of the object
print(SecretScanningLocation.to_json())

# convert the object into a dict
secret_scanning_location_dict = secret_scanning_location_instance.to_dict()
# create an instance of SecretScanningLocation from a dict
secret_scanning_location_from_dict = SecretScanningLocation.from_dict(secret_scanning_location_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


