Pod::Spec.new do |s|
  s.name         = "RNNaverMap"
  s.version      = "0.1.22"
  s.summary      = "RNNaverMap"
  s.description  = <<-DESC
                  RNNaverMap
                   DESC
  s.homepage     = "N/A"
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "author@domain.cn" }
  s.platform     = :ios, "9.0"
  s.source       = { :git => "https://github.com/author/RNNaverMap.git", :tag => "master" }
  s.source_files  = "RNNaverMap/**/*.{h,m}"
  s.requires_arc = true

  s.dependency "React"
  s.dependency "NMapsMap"
end

  