# coding: utf-8

"""
    Service Usage API

    Enables services that service consumers want to use on Google Cloud Platform, lists the available or enabled services, or disables services that service consumers no longer use.

    The version of the OpenAPI document: v1beta1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.batch_enable_services_response import BatchEnableServicesResponse

class TestBatchEnableServicesResponse(unittest.TestCase):
    """BatchEnableServicesResponse unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> BatchEnableServicesResponse:
        """Test BatchEnableServicesResponse
            include_optional is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `BatchEnableServicesResponse`
        """
        model = BatchEnableServicesResponse()
        if include_optional:
            return BatchEnableServicesResponse(
                failures = [
                    openapi_client.models.enable_failure.EnableFailure(
                        error_message = '', 
                        service_id = '', )
                    ],
                services = [
                    openapi_client.models.google_api_serviceusage_v1_service.GoogleApiServiceusageV1Service(
                        config = openapi_client.models.google_api_serviceusage_v1_service_config.GoogleApiServiceusageV1ServiceConfig(
                            apis = [
                                openapi_client.models.api.Api(
                                    methods = [
                                        openapi_client.models.method.Method(
                                            name = '', 
                                            options = [
                                                openapi_client.models.option.Option(
                                                    name = '', 
                                                    value = {
                                                        'key' : null
                                                        }, )
                                                ], 
                                            request_streaming = True, 
                                            request_type_url = '', 
                                            response_streaming = True, 
                                            response_type_url = '', 
                                            syntax = 'SYNTAX_PROTO2', )
                                        ], 
                                    mixins = [
                                        openapi_client.models.mixin.Mixin(
                                            name = '', 
                                            root = '', )
                                        ], 
                                    name = '', 
                                    options = [
                                        openapi_client.models.option.Option(
                                            name = '', )
                                        ], 
                                    source_context = openapi_client.models.source_context.SourceContext(
                                        file_name = '', ), 
                                    syntax = 'SYNTAX_PROTO2', 
                                    version = '', )
                                ], 
                            authentication = openapi_client.models.authentication.Authentication(
                                providers = [
                                    openapi_client.models.auth_provider.AuthProvider(
                                        audiences = '', 
                                        authorization_url = '', 
                                        id = '', 
                                        issuer = '', 
                                        jwks_uri = '', 
                                        jwt_locations = [
                                            openapi_client.models.jwt_location.JwtLocation(
                                                cookie = '', 
                                                header = '', 
                                                query = '', 
                                                value_prefix = '', )
                                            ], )
                                    ], 
                                rules = [
                                    openapi_client.models.authentication_rule.AuthenticationRule(
                                        allow_without_credential = True, 
                                        oauth = openapi_client.models.o_auth_requirements.OAuthRequirements(
                                            canonical_scopes = '', ), 
                                        requirements = [
                                            openapi_client.models.auth_requirement.AuthRequirement(
                                                audiences = '', 
                                                provider_id = '', )
                                            ], 
                                        selector = '', )
                                    ], ), 
                            documentation = openapi_client.models.documentation.Documentation(
                                documentation_root_url = '', 
                                overview = '', 
                                pages = [
                                    openapi_client.models.page.Page(
                                        content = '', 
                                        name = '', 
                                        subpages = [
                                            openapi_client.models.page.Page(
                                                content = '', 
                                                name = '', )
                                            ], )
                                    ], 
                                service_root_url = '', 
                                summary = '', ), 
                            endpoints = [
                                openapi_client.models.endpoint.Endpoint(
                                    aliases = [
                                        ''
                                        ], 
                                    allow_cors = True, 
                                    name = '', 
                                    target = '', )
                                ], 
                            monitored_resources = [
                                openapi_client.models.monitored_resource_descriptor.MonitoredResourceDescriptor(
                                    description = '', 
                                    display_name = '', 
                                    labels = [
                                        openapi_client.models.label_descriptor.LabelDescriptor(
                                            description = '', 
                                            key = '', 
                                            value_type = 'STRING', )
                                        ], 
                                    launch_stage = 'LAUNCH_STAGE_UNSPECIFIED', 
                                    name = '', 
                                    type = '', )
                                ], 
                            monitoring = openapi_client.models.monitoring.Monitoring(
                                consumer_destinations = [
                                    openapi_client.models.monitoring_destination.MonitoringDestination(
                                        metrics = [
                                            ''
                                            ], 
                                        monitored_resource = '', )
                                    ], 
                                producer_destinations = [
                                    openapi_client.models.monitoring_destination.MonitoringDestination(
                                        monitored_resource = '', )
                                    ], ), 
                            name = '', 
                            quota = openapi_client.models.quota.Quota(
                                limits = [
                                    openapi_client.models.quota_limit.QuotaLimit(
                                        default_limit = '', 
                                        description = '', 
                                        display_name = '', 
                                        duration = '', 
                                        free_tier = '', 
                                        max_limit = '', 
                                        metric = '', 
                                        name = '', 
                                        unit = '', 
                                        values = {
                                            'key' : ''
                                            }, )
                                    ], 
                                metric_rules = [
                                    openapi_client.models.metric_rule.MetricRule(
                                        metric_costs = {
                                            'key' : ''
                                            }, 
                                        selector = '', )
                                    ], ), 
                            title = '', 
                            usage = openapi_client.models.usage.Usage(
                                producer_notification_channel = '', ), ), 
                        name = '', 
                        parent = '', 
                        state = 'STATE_UNSPECIFIED', )
                    ]
            )
        else:
            return BatchEnableServicesResponse(
        )
        """

    def testBatchEnableServicesResponse(self):
        """Test BatchEnableServicesResponse"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
