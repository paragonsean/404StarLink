# coding: utf-8

"""
    Dataflow Kit Web Scraper

    Render Javascript driven pages, while we internally manage Headless Chrome and proxies for you.   - Build a custom web scraper with our Visual point-and-click toolkit. - Scrape the most popular Search engines result pages (SERP). - Convert web pages to PDF and capture screenshots. *** ### Authentication Dataflow Kit API require you to sign up for an API key in order to use the API.   The API key can be found in the [DFK Dashboard](https://account.dataflowkit.com) after _free registration_.  Pass a secret API Key to all API requests to the server as the `api_key` query parameter.  

    The version of the OpenAPI document: 1.3
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.action import Action

class TestAction(unittest.TestCase):
    """Action unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> Action:
        """Test Action
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `Action`
        """
        model = Action()
        if include_optional:
            return Action(
                ignore_if_not_present = False,
                selector = '.more-button',
                value = 'web scraper',
                skip_last_iteration = True,
                wait_delay = '5000',
                script = 'console.log("It works!")',
                actions = [
                    openapi_client.models.action.Action()
                    ],
                times = 3,
                scroll_by_pixels = 650,
                scrolling_element_selector = '#scroll-panel'
            )
        else:
            return Action(
        )
        """

    def testAction(self):
        """Test Action"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
