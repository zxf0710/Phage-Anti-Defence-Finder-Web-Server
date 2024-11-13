import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listSociodemographicfactorsbool(query) {
  return request({
    url: '/system/sociodemographicfactorsbool/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getSociodemographicfactorsbool(elderlyId) {
  return request({
    url: '/system/sociodemographicfactorsbool/' + elderlyId,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addSociodemographicfactorsbool(data) {
  return request({
    url: '/system/sociodemographicfactorsbool',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateSociodemographicfactorsbool(data) {
  return request({
    url: '/system/sociodemographicfactorsbool',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delSociodemographicfactorsbool(elderlyId) {
  return request({
    url: '/system/sociodemographicfactorsbool/' + elderlyId,
    method: 'delete'
  })
}
