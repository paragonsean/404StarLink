# Package


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**status** | [**PackageStatusEnum**](PackageStatusEnum.md) |  | [optional] 
**key** | **str** | This is the unique package tracking key. You can use this key to track the current progress of the translation packaging with /package/check call. | [optional] 

## Example

```python
from openapi_client.models.package import Package

# TODO update the JSON string below
json = "{}"
# create an instance of Package from a JSON string
package_instance = Package.from_json(json)
# print the JSON string representation of the object
print(Package.to_json())

# convert the object into a dict
package_dict = package_instance.to_dict()
# create an instance of Package from a dict
package_from_dict = Package.from_dict(package_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


