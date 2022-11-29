# coding: utf-8

# flake8: noqa

"""
    Migration Center API

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: v1alpha1
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


__version__ = "1.0.0"

# import apis into sdk package
from openapi_client.api.projects_api import ProjectsApi

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
from openapi_client.models.add_assets_to_group_request import AddAssetsToGroupRequest
from openapi_client.models.aggregate_assets_values_request import AggregateAssetsValuesRequest
from openapi_client.models.aggregate_assets_values_response import AggregateAssetsValuesResponse
from openapi_client.models.aggregation import Aggregation
from openapi_client.models.aggregation_histogram import AggregationHistogram
from openapi_client.models.aggregation_result import AggregationResult
from openapi_client.models.aggregation_result_count import AggregationResultCount
from openapi_client.models.aggregation_result_frequency import AggregationResultFrequency
from openapi_client.models.aggregation_result_histogram import AggregationResultHistogram
from openapi_client.models.aggregation_result_histogram_bucket import AggregationResultHistogramBucket
from openapi_client.models.aggregation_result_sum import AggregationResultSum
from openapi_client.models.asset import Asset
from openapi_client.models.asset_frame import AssetFrame
from openapi_client.models.asset_list import AssetList
from openapi_client.models.asset_performance_data import AssetPerformanceData
from openapi_client.models.aws_ec2_platform_details import AwsEc2PlatformDetails
from openapi_client.models.azure_vm_platform_details import AzureVmPlatformDetails
from openapi_client.models.batch_delete_assets_request import BatchDeleteAssetsRequest
from openapi_client.models.batch_update_assets_request import BatchUpdateAssetsRequest
from openapi_client.models.batch_update_assets_response import BatchUpdateAssetsResponse
from openapi_client.models.bios_details import BiosDetails
from openapi_client.models.compute_engine_migration_target import ComputeEngineMigrationTarget
from openapi_client.models.compute_engine_preferences import ComputeEnginePreferences
from openapi_client.models.compute_engine_shape_descriptor import ComputeEngineShapeDescriptor
from openapi_client.models.cpu_usage_sample import CpuUsageSample
from openapi_client.models.daily_resource_usage_aggregation import DailyResourceUsageAggregation
from openapi_client.models.daily_resource_usage_aggregation_cpu import DailyResourceUsageAggregationCPU
from openapi_client.models.daily_resource_usage_aggregation_disk import DailyResourceUsageAggregationDisk
from openapi_client.models.daily_resource_usage_aggregation_memory import DailyResourceUsageAggregationMemory
from openapi_client.models.daily_resource_usage_aggregation_network import DailyResourceUsageAggregationNetwork
from openapi_client.models.daily_resource_usage_aggregation_stats import DailyResourceUsageAggregationStats
from openapi_client.models.date_time import DateTime
from openapi_client.models.disk_entry import DiskEntry
from openapi_client.models.disk_entry_list import DiskEntryList
from openapi_client.models.disk_partition import DiskPartition
from openapi_client.models.disk_partition_list import DiskPartitionList
from openapi_client.models.disk_usage_sample import DiskUsageSample
from openapi_client.models.execution_report import ExecutionReport
from openapi_client.models.file_validation_report import FileValidationReport
from openapi_client.models.fit_descriptor import FitDescriptor
from openapi_client.models.frames import Frames
from openapi_client.models.fstab_entry import FstabEntry
from openapi_client.models.fstab_entry_list import FstabEntryList
from openapi_client.models.gcs_payload_info import GCSPayloadInfo
from openapi_client.models.generic_platform_details import GenericPlatformDetails
from openapi_client.models.group import Group
from openapi_client.models.guest_config_details import GuestConfigDetails
from openapi_client.models.guest_installed_application import GuestInstalledApplication
from openapi_client.models.guest_installed_application_list import GuestInstalledApplicationList
from openapi_client.models.guest_os_details import GuestOsDetails
from openapi_client.models.guest_runtime_details import GuestRuntimeDetails
from openapi_client.models.hosts_entry import HostsEntry
from openapi_client.models.hosts_entry_list import HostsEntryList
from openapi_client.models.import_data_file import ImportDataFile
from openapi_client.models.import_error import ImportError
from openapi_client.models.import_job import ImportJob
from openapi_client.models.import_row_error import ImportRowError
from openapi_client.models.inline_payload_info import InlinePayloadInfo
from openapi_client.models.insight import Insight
from openapi_client.models.insight_list import InsightList
from openapi_client.models.list_assets_response import ListAssetsResponse
from openapi_client.models.list_groups_response import ListGroupsResponse
from openapi_client.models.list_import_data_files_response import ListImportDataFilesResponse
from openapi_client.models.list_import_jobs_response import ListImportJobsResponse
from openapi_client.models.list_locations_response import ListLocationsResponse
from openapi_client.models.list_operations_response import ListOperationsResponse
from openapi_client.models.list_preference_sets_response import ListPreferenceSetsResponse
from openapi_client.models.list_report_configs_response import ListReportConfigsResponse
from openapi_client.models.list_reports_response import ListReportsResponse
from openapi_client.models.list_sources_response import ListSourcesResponse
from openapi_client.models.location import Location
from openapi_client.models.machine_preferences import MachinePreferences
from openapi_client.models.machine_series import MachineSeries
from openapi_client.models.memory_usage_sample import MemoryUsageSample
from openapi_client.models.migration_insight import MigrationInsight
from openapi_client.models.model_date import ModelDate
from openapi_client.models.money import Money
from openapi_client.models.network_adapter_details import NetworkAdapterDetails
from openapi_client.models.network_adapter_list import NetworkAdapterList
from openapi_client.models.network_address import NetworkAddress
from openapi_client.models.network_address_list import NetworkAddressList
from openapi_client.models.network_connection import NetworkConnection
from openapi_client.models.network_connection_list import NetworkConnectionList
from openapi_client.models.network_usage_sample import NetworkUsageSample
from openapi_client.models.nfs_export import NfsExport
from openapi_client.models.nfs_export_list import NfsExportList
from openapi_client.models.open_file_details import OpenFileDetails
from openapi_client.models.open_file_list import OpenFileList
from openapi_client.models.operation import Operation
from openapi_client.models.operation_metadata import OperationMetadata
from openapi_client.models.payload_file import PayloadFile
from openapi_client.models.performance_sample import PerformanceSample
from openapi_client.models.physical_platform_details import PhysicalPlatformDetails
from openapi_client.models.platform_details import PlatformDetails
from openapi_client.models.preference_set import PreferenceSet
from openapi_client.models.region_preferences import RegionPreferences
from openapi_client.models.remove_assets_from_group_request import RemoveAssetsFromGroupRequest
from openapi_client.models.report import Report
from openapi_client.models.report_config import ReportConfig
from openapi_client.models.report_config_group_preference_set_assignment import ReportConfigGroupPreferenceSetAssignment
from openapi_client.models.report_summary import ReportSummary
from openapi_client.models.report_summary_asset_aggregate_stats import ReportSummaryAssetAggregateStats
from openapi_client.models.report_summary_chart_data import ReportSummaryChartData
from openapi_client.models.report_summary_chart_data_data_point import ReportSummaryChartDataDataPoint
from openapi_client.models.report_summary_group_finding import ReportSummaryGroupFinding
from openapi_client.models.report_summary_group_preference_set_finding import ReportSummaryGroupPreferenceSetFinding
from openapi_client.models.report_summary_histogram_chart_data import ReportSummaryHistogramChartData
from openapi_client.models.report_summary_histogram_chart_data_bucket import ReportSummaryHistogramChartDataBucket
from openapi_client.models.report_summary_machine_finding import ReportSummaryMachineFinding
from openapi_client.models.report_summary_machine_series_allocation import ReportSummaryMachineSeriesAllocation
from openapi_client.models.report_summary_utilization_chart_data import ReportSummaryUtilizationChartData
from openapi_client.models.run_import_job_request import RunImportJobRequest
from openapi_client.models.running_process import RunningProcess
from openapi_client.models.running_process_list import RunningProcessList
from openapi_client.models.running_service import RunningService
from openapi_client.models.running_service_list import RunningServiceList
from openapi_client.models.runtime_network_info import RuntimeNetworkInfo
from openapi_client.models.selinux import Selinux
from openapi_client.models.settings import Settings
from openapi_client.models.source import Source
from openapi_client.models.status import Status
from openapi_client.models.time_zone import TimeZone
from openapi_client.models.update_asset_request import UpdateAssetRequest
from openapi_client.models.upload_file_info import UploadFileInfo
from openapi_client.models.validate_import_job_request import ValidateImportJobRequest
from openapi_client.models.validation_report import ValidationReport
from openapi_client.models.virtual_machine_architecture_details import VirtualMachineArchitectureDetails
from openapi_client.models.virtual_machine_details import VirtualMachineDetails
from openapi_client.models.virtual_machine_disk_details import VirtualMachineDiskDetails
from openapi_client.models.virtual_machine_network_details import VirtualMachineNetworkDetails
from openapi_client.models.virtual_machine_preferences import VirtualMachinePreferences
from openapi_client.models.vmware_disk_config import VmwareDiskConfig
from openapi_client.models.vmware_platform_details import VmwarePlatformDetails
