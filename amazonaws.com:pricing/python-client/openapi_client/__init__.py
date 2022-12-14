# coding: utf-8

# flake8: noqa

"""
    AWS Price List Service

    <p>Amazon Web Services Price List API is a centralized and convenient way to programmatically query Amazon Web Services for services, products, and pricing information. The Amazon Web Services Price List uses standardized product attributes such as <code>Location</code>, <code>Storage Class</code>, and <code>Operating System</code>, and provides prices at the SKU level. You can use the Amazon Web Services Price List to build cost control and scenario planning tools, reconcile billing data, forecast future spend for budgeting purposes, and provide cost benefit analysis that compare your internal workloads with Amazon Web Services.</p> <p>Use <code>GetServices</code> without a service code to retrieve the service codes for all AWS services, then <code>GetServices</code> with a service code to retrieve the attribute names for that service. After you have the service code and attribute names, you can use <code>GetAttributeValues</code> to see what values are available for an attribute. With the service code and an attribute name and value, you can use <code>GetProducts</code> to find specific products that you're interested in, such as an <code>AmazonEC2</code> instance, with a <code>Provisioned IOPS</code> <code>volumeType</code>.</p> <p>Service Endpoint</p> <p>Amazon Web Services Price List service API provides the following two endpoints:</p> <ul> <li> <p>https://api.pricing.us-east-1.amazonaws.com</p> </li> <li> <p>https://api.pricing.ap-south-1.amazonaws.com</p> </li> </ul>

    The version of the OpenAPI document: 2017-10-15
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


__version__ = "1.0.0"

# import apis into sdk package
from openapi_client.api.default_api import DefaultApi

# import ApiClient
from openapi_client.api_response import ApiResponse
from openapi_client.api_client import ApiClient
from openapi_client.configuration import Configuration
from openapi_client.exceptions import OpenApiException
from openapi_client.exceptions import ApiTypeError
from openapi_client.exceptions import ApiValueError
from openapi_client.exceptions import ApiKeyError
from openapi_client.exceptions import ApiAttributeError
from openapi_client.exceptions import ApiException

# import models into sdk package
from openapi_client.models.attribute_value import AttributeValue
from openapi_client.models.describe_services_request import DescribeServicesRequest
from openapi_client.models.describe_services_response import DescribeServicesResponse
from openapi_client.models.filter import Filter
from openapi_client.models.filter_type import FilterType
from openapi_client.models.get_attribute_values_request import GetAttributeValuesRequest
from openapi_client.models.get_attribute_values_response import GetAttributeValuesResponse
from openapi_client.models.get_price_list_file_url_request import GetPriceListFileUrlRequest
from openapi_client.models.get_price_list_file_url_response import GetPriceListFileUrlResponse
from openapi_client.models.get_products_request import GetProductsRequest
from openapi_client.models.get_products_response import GetProductsResponse
from openapi_client.models.list_price_lists_request import ListPriceListsRequest
from openapi_client.models.list_price_lists_response import ListPriceListsResponse
from openapi_client.models.price_list import PriceList
from openapi_client.models.service import Service
