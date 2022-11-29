# coding: utf-8

"""
    Migration Center API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: v1alpha1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.source import Source

class TestSource(unittest.TestCase):
    """Source unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Source:
        """Test Source
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Source`
        """
        model = Source()
        if include_optional:
            return Source(
                create_time = '',
                description = '',
                display_name = '',
                is_managed = True,
                name = '',
                pending_frame_count = 56,
                priority = 56,
                type = 'SOURCE_TYPE_UNKNOWN',
                update_time = ''
            )
        else:
            return Source(
        )
        """

    def testSource(self):
        """Test Source"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
