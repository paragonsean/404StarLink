# coding: utf-8

"""
    AWS Elemental MediaConvert

    AWS Elemental MediaConvert

    The version of the OpenAPI document: 2017-08-29
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.job_template import JobTemplate

class TestJobTemplate(unittest.TestCase):
    """JobTemplate unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> JobTemplate:
        """Test JobTemplate
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `JobTemplate`
        """
        model = JobTemplate()
        if include_optional:
            return JobTemplate(
                acceleration_settings = None,
                arn = None,
                category = None,
                created_at = None,
                description = None,
                hop_destinations = None,
                last_updated = None,
                name = None,
                priority = None,
                queue = None,
                settings = None,
                status_update_interval = None,
                type = None
            )
        else:
            return JobTemplate(
                name = None,
                settings = None,
        )
        """

    def testJobTemplate(self):
        """Test JobTemplate"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
