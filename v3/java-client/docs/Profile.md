

# Profile

JSON template for an Analytics view (profile).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**accountId** | **String** | Account ID to which this view (profile) belongs. |  [optional] |
|**botFilteringEnabled** | **Boolean** | Indicates whether bot filtering is enabled for this view (profile). |  [optional] |
|**childLink** | [**ProfileChildLink**](ProfileChildLink.md) |  |  [optional] |
|**created** | **OffsetDateTime** | Time this view (profile) was created. |  [optional] [readonly] |
|**currency** | **String** | The currency type associated with this view (profile), defaults to USD. The supported values are: USD, JPY, EUR, GBP, AUD, KRW, BRL, CNY, DKK, RUB, SEK, NOK, PLN, TRY, TWD, HKD, THB, IDR, ARS, MXN, VND, PHP, INR, CHF, CAD, CZK, NZD, HUF, BGN, LTL, ZAR, UAH, AED, BOB, CLP, COP, EGP, HRK, ILS, MAD, MYR, PEN, PKR, RON, RSD, SAR, SGD, VEF, LVL |  [optional] |
|**defaultPage** | **String** | Default page for this view (profile). |  [optional] |
|**eCommerceTracking** | **Boolean** | Indicates whether ecommerce tracking is enabled for this view (profile). |  [optional] |
|**enhancedECommerceTracking** | **Boolean** | Indicates whether enhanced ecommerce tracking is enabled for this view (profile). This property can only be enabled if ecommerce tracking is enabled. |  [optional] |
|**excludeQueryParameters** | **String** | The query parameters that are excluded from this view (profile). |  [optional] |
|**id** | **String** | View (Profile) ID. |  [optional] |
|**internalWebPropertyId** | **String** | Internal ID for the web property to which this view (profile) belongs. |  [optional] [readonly] |
|**kind** | **String** | Resource type for Analytics view (profile). |  [optional] [readonly] |
|**name** | **String** | Name of this view (profile). |  [optional] |
|**parentLink** | [**ProfileParentLink**](ProfileParentLink.md) |  |  [optional] |
|**permissions** | [**ProfilePermissions**](ProfilePermissions.md) |  |  [optional] |
|**selfLink** | **String** | Link for this view (profile). |  [optional] [readonly] |
|**siteSearchCategoryParameters** | **String** | Site search category parameters for this view (profile). |  [optional] |
|**siteSearchQueryParameters** | **String** | The site search query parameters for this view (profile). |  [optional] |
|**starred** | **Boolean** | Indicates whether this view (profile) is starred or not. |  [optional] |
|**stripSiteSearchCategoryParameters** | **Boolean** | Whether or not Analytics will strip search category parameters from the URLs in your reports. |  [optional] |
|**stripSiteSearchQueryParameters** | **Boolean** | Whether or not Analytics will strip search query parameters from the URLs in your reports. |  [optional] |
|**timezone** | **String** | Time zone for which this view (profile) has been configured. Time zones are identified by strings from the TZ database. |  [optional] |
|**type** | **String** | View (Profile) type. Supported types: WEB or APP. |  [optional] |
|**updated** | **OffsetDateTime** | Time this view (profile) was last modified. |  [optional] [readonly] |
|**webPropertyId** | **String** | Web property ID of the form UA-XXXXX-YY to which this view (profile) belongs. |  [optional] [readonly] |
|**websiteUrl** | **String** | Website URL for this view (profile). |  [optional] |



