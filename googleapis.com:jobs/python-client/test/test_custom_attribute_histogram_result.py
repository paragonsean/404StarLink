# coding: utf-8

"""
    Cloud Talent Solution API

    Cloud Talent Solution provides the capability to create, read, update, and delete job postings, as well as search jobs based on keywords and filters. 

    The version of the OpenAPI document: v3p1beta1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.custom_attribute_histogram_result import CustomAttributeHistogramResult

class TestCustomAttributeHistogramResult(unittest.TestCase):
    """CustomAttributeHistogramResult unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CustomAttributeHistogramResult:
        """Test CustomAttributeHistogramResult
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CustomAttributeHistogramResult`
        """
        model = CustomAttributeHistogramResult()
        if include_optional:
            return CustomAttributeHistogramResult(
                key = '',
                long_value_histogram_result = openapi_client.models.numeric_bucketing_result.NumericBucketingResult(
                    counts = [
                        openapi_client.models.bucketized_count.BucketizedCount(
                            count = 56, 
                            range = openapi_client.models.bucket_range.BucketRange(
                                from = 1.337, 
                                to = 1.337, ), )
                        ], 
                    max_value = 1.337, 
                    min_value = 1.337, ),
                string_value_histogram_result = {
                    'key' : 56
                    }
            )
        else:
            return CustomAttributeHistogramResult(
        )
        """

    def testCustomAttributeHistogramResult(self):
        """Test CustomAttributeHistogramResult"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
