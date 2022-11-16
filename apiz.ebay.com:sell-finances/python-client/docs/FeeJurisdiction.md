# FeeJurisdiction

This container returns jurisdiction information about region-specific fees that are charged to sellers.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**region_name** | **str** | String value that indicates the name of the region to which a region-specific fee applies.&lt;br&gt;&lt;br&gt;The set of valid &lt;b&gt;regionName&lt;/b&gt; values that may be returned is determined by the &lt;b&gt;regionType&lt;/b&gt; value.&lt;br&gt;&lt;br&gt;&lt;span class&#x3D;\&quot;tablenote\&quot;&gt;&lt;strong&gt;Note:&lt;/strong&gt; Currently, supported &lt;b&gt;regionName&lt;/b&gt; values that may be returned are standard two-character country or state codes.&lt;br&gt;&lt;br&gt;Typical examples include:&lt;ul&gt;&lt;li&gt;&lt;b&gt;MX&lt;/b&gt; [Mexico]&lt;/li&gt;&lt;li&gt;&lt;b&gt;IN&lt;/b&gt; [India]&lt;/li&gt;&lt;li&gt;&lt;b&gt;US&lt;/b&gt; [United States]&lt;/li&gt;&lt;li&gt;CA [California]&lt;/li&gt;&lt;li&gt;VT [Vermont]&lt;/li&gt;&lt;li&gt;ME [Maine]&lt;/li&gt;&lt;/ul&gt;&lt;/span&gt; | [optional] 
**region_type** | **str** | The enumeration value returned here indicates the type of region that is collecting the corresponding fee. For implementation help, refer to &lt;a href&#x3D;&#39;https://developer.ebay.com/api-docs/sell/finances/types/pay:RegionTypeEnum&#39;&gt;eBay API documentation&lt;/a&gt; | [optional] 

## Example

```python
from openapi_client.models.fee_jurisdiction import FeeJurisdiction

# TODO update the JSON string below
json = "{}"
# create an instance of FeeJurisdiction from a JSON string
fee_jurisdiction_instance = FeeJurisdiction.from_json(json)
# print the JSON string representation of the object
print(FeeJurisdiction.to_json())

# convert the object into a dict
fee_jurisdiction_dict = fee_jurisdiction_instance.to_dict()
# create an instance of FeeJurisdiction from a dict
fee_jurisdiction_from_dict = FeeJurisdiction.from_dict(fee_jurisdiction_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


